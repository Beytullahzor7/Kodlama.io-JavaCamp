package thirdWeekHomeworks.homework3.dataAccess.hibernateDao;

import thirdWeekHomeworks.homework3.dataAccess.CategoryDao;
import thirdWeekHomeworks.homework2.staticDemo.model.Category;

public class HibernateCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {
        System.out.println("Category Added");
    }

    @Override
    public void update(Category category) {
        System.out.println("Category Updated");
    }

    @Override
    public void delete(int categoryId) {
        System.out.println("Category Deleted");
    }

    @Override
    public void list() {
        System.out.println("Category Listed");
    }
}
