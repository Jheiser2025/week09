
package projects.service;

import projects.Project;
import projects.dao.ProjectDao;



public class ProjectService {
  private ProjectDao projectDao = new ProjectDao();


  public Project addProject(Project project) {
    return projectDao.insertProject(project);
  }


}
