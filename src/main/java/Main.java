import dao.QuestionDao;
import domain.Question;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.QuestionService;


import java.util.List;

public class Main {
  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
    QuestionService service = context.getBean(QuestionService.class);
    List<Question> questions = service.getQuestionsList();
    for (Question q : questions) {
      System.out.println(q.toString());
    }
  }
}
