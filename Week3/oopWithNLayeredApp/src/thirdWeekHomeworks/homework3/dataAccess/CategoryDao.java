package thirdWeekHomeworks.homework3.dataAccess;

import thirdWeekHomeworks.homework3.model.Category;

public interface CategoryDao {

    void add(Category category);

    void update(Category category);

    void delete(int categoryId);

    void list();
}
