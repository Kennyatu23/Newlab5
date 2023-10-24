package ie.atu.lab5;


import org.springframework.web.client.RestTemplate;

public class BlockingService {
    private final RestTemplate restTemplate;

    public BlockingService(RestTemplate restTemplate) { this.restTemplate = restTemplate;}

    public String fetchDataBlocking() {
        // simulate a delay of 2 seconds
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", String.class);
    }
}