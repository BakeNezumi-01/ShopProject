<#import "parts/common.ftl" as c>
<@c.page>
    <div>
        <div style="width: 50%"><img src="/images/${good.imageName}" class="card-img-top"></div>
        <div style="float: right; width: 50% ">
            <td>${good.goodName}</td>
            <td>${good.price_selling}</td>
            <td>${good.date_added}</td></div>
    </div>
    <div class="d-flex p-2 bd-highlight">${good.product_description}</div>
    <form method="post" enctype="multipart/form-data">
        <input type="hidden" name="goodId" value="${good.id}" />
        <#if user??><input type="hidden" name="userId" value="${user.id}" />
        <#else> <input type="hidden" name="userId" value="" /></#if>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="button" class="btn btn-primary" style="float:right;">Buy</button>
    </form>
</@c.page>
