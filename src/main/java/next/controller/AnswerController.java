package next.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.dao.AnswerDao;
import next.model.Answer;
import next.model.Question;
import core.mvc.Controller;

public class AnswerController implements Controller {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Answer theAnswer = new Answer(request.getParameter("writer"),
				request.getParameter("contents"), Integer.parseInt(request
						.getParameter("questionId")));
		AnswerDao answerDao = new AnswerDao();
		answerDao.insert(theAnswer);
		
		return "api";
	}

}
