package ie.atu.lab5;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TodoResponse {
    @JsonProperty("userid")
    private int userid;
    @JsonProperty ("id")
    private int id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("completed")
    private boolean completed;
}
