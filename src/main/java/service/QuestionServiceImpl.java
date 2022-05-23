package service;

import dao.QuestionDao;
import domain.Question;

import java.util.List;

public class QuestionServiceImpl implements QuestionService{
  QuestionDao questionDao;

  public QuestionServiceImpl(QuestionDao questionDao){
    this.questionDao=questionDao;
  }

  @Override
  public List<Question> getQuestionsList() {
    return questionDao.getList();
  }
}
