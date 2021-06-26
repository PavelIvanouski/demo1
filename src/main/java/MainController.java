import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @GetMapping("/welcome")
    public Person welcome() {
        return new Person(1,"John","123@mail.ru","121212");
    }



}
