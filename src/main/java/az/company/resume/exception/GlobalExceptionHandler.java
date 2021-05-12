package az.company.resume.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({Throwable.class})
    public ModelAndView getNotFound(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("not-found");
        return modelAndView;
    }
}
