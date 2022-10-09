package thirdWeekHomeworks.homework3.business;

import thirdWeekHomeworks.homework3.core.logging.ILogger;
import thirdWeekHomeworks.homework3.dataAccess.CategoryDao;
import thirdWeekHomeworks.homework3.model.Category;
import thirdWeekHomeworks.homework3.util.CourseValidator;

import java.util.List;

public class CategoryManager {
    private final CategoryDao categoryDao;
    private final ILogger[] loggers;
    private final List<Category> categoryList;

    public CategoryManager(CategoryDao categoryDao, ILogger[] loggers, List<Category> categoryList) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categoryList = categoryList;
    }

    private void logMethod() {
        for (ILogger logger : loggers) {
            logger.log("Logged");
        }
    }

    public void add(Category category) {
        boolean result = categoryList.stream().anyMatch(i -> i.getCategoryName().equals(category.getCategoryName()));

        if (!result) {
            categoryList.add(category);
            categoryDao.add(category);
            logMethod();
        } else {
            System.out.println("This Category Already Exist!");
        }
    }

    public void update(Category category) {
        Category categoryUpdate = new Category();

        categoryUpdate.setId(category.getId());
        categoryUpdate.setCategoryName(category.getCategoryName());

        System.out.println("Updated");
        categoryList.add(categoryUpdate);
        logMethod();
    }

    public void delete(int categoryId) {
        String result = CourseValidator.isCourseValidForDelete(categoryId) ? "Deleted" : "Could not Deleted";
        System.out.println(result);
        categoryList.remove(categoryId - 1);
        logMethod();
    }

    public void list() {
        for (Category category : categoryList) {
            System.out.println(category.toString());
        }
    }
}
