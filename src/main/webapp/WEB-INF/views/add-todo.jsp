<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

    <div class="container">
        Your New Action Item:
        <form method="POST" action="/add-todo.do">
            Description : <input name="todo" type="text" />
            Category : <input name="category" type="text" />
                          <input name="add" type="submit" />
        </form>
    </div>

<%@include file="../common/footer.jspf"%>
