package filter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class ChangeEmailRequestWrapper extends HttpServletRequestWrapper {

  private String newPassword;

  public ChangeEmailRequestWrapper(HttpServletRequest request) {
    super(request);
  }

  public void setNewPassword(String newPassword){
    this.newPassword = newPassword;
  }

  @Override
  public String getParameter(String name) {

    if(name.equalsIgnoreCase("password")){
      return newPassword;
    }

    return super.getParameter(name);
  }
}
