package cn.taketoday.plugin.web.impl;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;

import cn.taketoday.plugin.web.WebApplication;

/**
 * @author TODAY 2021/3/16 20:45
 */
public class DefaultWebApplication implements WebApplication {
  private static final Logger log = Logger.getInstance(DefaultWebApplication.class);

  public DefaultWebApplication(Project project) {
    System.out.println("project " + project);
  }
}
