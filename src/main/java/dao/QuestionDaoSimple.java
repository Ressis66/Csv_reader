package dao;

import com.opencsv.bean.CsvToBeanBuilder;
import domain.Question;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;



public class QuestionDaoSimple implements QuestionDao {


  FileReader reader = new FileReader("src/main/resources/QuestionsList.csv");


  List<Question> beans = new CsvToBeanBuilder<Question>(reader)
          .withType(Question.class)
          .build()
          .parse();

  public QuestionDaoSimple() throws FileNotFoundException {
  }

  @Override
  public List<Question> getList() {
    return beans;
  }
}
