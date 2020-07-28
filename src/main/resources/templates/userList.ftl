<#import "parts/common.ftl" as c>

<@c.page>
List of users
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Role</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
        <tr>
            <td>${user.username}</td>
            <td><#list user.roles as role>${role}<#sep>, </#list></td>
            <td><a href="/user/${user.id}">edit</a></td>
        </tr>
    </#list>
    </tbody>
</table>
    List of goods
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Role</th>
            <th></th>
        </tr>
        </thead>
        <#list goods as good>
            <tr>
                <td>${good.id}</td>
                <td>${good.goodName}</td>
                <td>${good.product_description}</td>
                <td>${good.price_selling}</td>
                <td>${good.price_purchase}</td>
                <td>${good.imageName}</td>
                <td>${good.date_added}</td>
                <td><a href="/good/${good.id?ifExists}">edit</a></td>
            </tr>
        </#list>
    </table>
</@c.page>
