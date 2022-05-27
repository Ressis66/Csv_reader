package dao;

import com.opencsv.bean.CsvToBeanBuilder;
import domain.Question;




import java.io.FileReader;
import java.io.IOException;
import java.util.List;



public class QuestionDaoSimple implements QuestionDao {

  String questions;

  public QuestionDaoSimple(String questions) throws IOException {
    this.questions = questions;
  }

  FileReader reader = new FileReader(questions);

  List<Question> beans = new CsvToBeanBuilder<Question>(reader)
          .withType(Question.class)
          .build()
          .parse();


  @Override
  public List<Question> getList() {
    return beans;
  }
}
