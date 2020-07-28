<#assign
    known = Session.SPRING_SECURITY_CONTEXT??
>
<#if known>
    <#assign
        user = Session.SPRING_SECURITY_CONTEXT.authentication.principal
        name = user.getUsername()
        isAdmin = user.isAdmin()
        isUser = user.isUser()
        isSeller = user.isSeller()
        isHolder = user.isHolder()
        sum = 0
    >
<#else>
    <#assign
        name = "Guest"
        isAdmin = false
    >
</#if>
