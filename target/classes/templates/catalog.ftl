<#import "parts/common.ftl" as c>
<@c.page>
    <div class="form-row">
        <div class="form-group col-sm-10">
                <form method="get" action="/main" class="form-inline">
                    <input type="text" name="filter" class="form-control" value="${filter?ifExists}"
                           placeholder="Search by description( not working. yet.)">
                    <button type="submit" class="btn btn-primary ml-2">Search</button>
                </form>
        </div>
    </div>
    <div class="card-columns">
        <#list goods as good>
            <div class="card my-3">
                <#if good.imageName??>
                    <a href="/good/${good.id}"><img src="/images/${good.imageName}" class="card-img-top"></a>
                </#if>
                <div class="m-2">
                    <a href="/good/${good.id}"><span class="font-weight-bold">${good.goodName} </span></a>
                    <i style="float:right;">${good.price_selling} $</i>
                </div>
                <div class="card-footer text-muted">
                    <form method="post" enctype="multipart/form-data">
                        ${good.product_description}
                    <input type="hidden" name="goodId" value="${good.id}" />
                    <#if user??><input type="hidden" name="userId" value="${user.id}" />
                    <#else> <input type="hidden" name="userId" value="" /></#if>
                    <input type="hidden" name="_csrf" value="${_csrf.token}" />
                    <button type="submit" class="btn btn-success" style="float:right;">Add</button>
                    </form>
                </div>
            </div>
        <#else>
            No good at all
        </#list>
    </div>
</@c.page>
