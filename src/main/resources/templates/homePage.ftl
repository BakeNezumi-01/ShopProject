<#import "parts/common.ftl" as c>
<@c.page>
You are ${user.username}<br/><br/>
    Your information:<br/>
    firstname  <#if user.firstname??> ${user.firstname}</#if><br/>
    secondname  <#if user.secondname??>${user.secondname}</#if><br/>
    email  <#if user.email??>${user.email}</#if><br/>
    phone<#if user.phone??>${user.phone}</#if><br/><br/>
    <form method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">firstname</label>
            <div class="col-sm-6">
                <input type="text" name="firstname" class="form-control" placeholder="firstname" />
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">secondname</label>
            <div class="col-sm-6">
                <input type="text" name="secondname" class="form-control" placeholder="secondname" />
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">email</label>
            <div class="col-sm-6">
                <input type="text" name="email" class="form-control" placeholder="email" />
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">phone</label>
            <div class="col-sm-6">
                <input type="number" name="phone" class="form-control" placeholder="phone" />
            </div>
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button class="btn btn-primary" type="submit">Send</button>
    </form>
    <#if isHolder>
        Statistic
        <form action="/homePage" method="post">
            <input type="date" name="date1" value="">
            <input type="date" name="date2" value="">
            <#list orders as order>
                <#if order.date >= date1>
                    <#if order.date <= date2>
                        <div>
                            <label> ${order.good}</label>
                        </div>
                        <#assign sum+=order.sum >
                    </#if>
                </#if>
            </#list>
            sum
            <input type="hidden" value="${_csrf.token}" name="_csrf">
            <button type="submit">Send</button>
        </form>
    </#if>
    <#if isSeller>
        Good List
        <table>
            <thead>
            <tr>
                <th>Good</th>
                <th>Action</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <#list goods as good>
                <#if good.seller == user.id>
                    <tr>
                        <td>${good.goodName}</td>
                        <td>${good.imageName}</td>
                        <td>${good.price_selling}</td>
                        <td>${good.copies}</td>
                        <td><a href="/good/${good.id}">edit</a></td>
                    </tr>
                </#if>
            </#list>
            </tbody>
        </table>
    </#if>
    <#if isSeller>
        New Good
        <form action="/user" method="post">
            <input type="Text"  name="goodName">
            <input type="Text"  name="product_description">
            <input type="Integer" name="price_selling">
            <input type="Integer"  name="price_purchase">
            <input type="Text" name="imageName">
            <input type="Text"  name="date_added">
            <input type="hidden" value="${_csrf.token}" name="_csrf">
            <button type="submit">Save</button>
        </form>
    </#if>
    Your orders
    <table>
        <thead>
        <tr>
            <th>OrderId</th>
            <th>Paid</th>
            <th></th>
        </tr>
        </thead>
        <#list orders as order>
            <#if true >
                <tr>
                    <th>${order.id}</th>
                    <th>${order.paid}</th>
                </tr>
            </#if>
        </#list>
    </table>
</@c.page>