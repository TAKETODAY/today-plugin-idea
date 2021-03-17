package cn.taketoday.plugin.web;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;

import org.jetbrains.annotations.NotNull;

/**
 * @author TODAY 2021/3/16 20:45
 */
public interface WebApplication {

  static WebApplication getInstance(@NotNull Project project) {
    return ServiceManager.getService(project, WebApplication.class);
  }
}
