<#import "parts/common.ftl" as c>
<@c.page>
    Good editor
    <form action="/good" method="post">
        <input type="text" name="goodName" value="${good.goodName}">
        <input type="hidden" value="${user.id}" name="userId">
        <input type="hidden" value="${_csrf.token}" name="_csrf">
        <button type="submit">Save</button>
    </form>
</@c.page>
