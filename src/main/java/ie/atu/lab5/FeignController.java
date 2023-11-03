package ie.atu.lab5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

@RestController
public class FeignController {

    @Autowired
    private final FeignService feignService;

    public  FeignController(FeignService feignService ) {
        this.feignService = feignService ;
    }

    @GetMapping("/feign")
    public String getFeignData() throws Exception, InterruptedException {
        long startTime = System.currentTimeMillis();

        List<CompletableFuture<TodoResponse>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            CompletableFuture<TodoResponse> future = CompletableFuture.supplyAsync(() -> feignService.fetchData());
            futures.add(future);
        }

        CompletableFuture<Void> all0f = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

            all0f.get(); //Wait for all requests to complete
            long endTime = System.currentTimeMillis();
            return  "Total execution time: " + (endTime - startTime) + " ns";

    }
};


