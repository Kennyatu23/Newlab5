package ie.atu.lab5;

public class TodoResponse {
    @jsonProperty("userid")
    private int userid;
    @jsonProperty("id")
    private int id;
    @jsonPropperty("title")
    private String title;
    @jsonProperety("completed")
    private boolean completed;
}
