import domain.Question;
import org.junit.Assert;
import org.junit.Test;


public class QuestionServiceImplTest {

@Test
  public void testQuestionEntity(){
     Question testquestion = new Question(1, "Sorry", "Can't", "Remember", "Anything about Junit");
     Assert.assertNotNull(testquestion);
     Assert.assertEquals(testquestion.getB_answer(), "Remember");

}


}
