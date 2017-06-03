package somedir.todo;

import java.util.ArrayList;
import java.util.List;


public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static{
        todos.add(new Todo("Learn Web Application", "learn"));
        todos.add(new Todo("Learn Spring", "learn"));
        todos.add(new Todo("Learn Spring MVC", "learn"));
    }

    public List<Todo> retrieveTodos() {
        return todos;
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public void deleteTodo(Todo todo) {
        todos.remove(todo);
    }
}
