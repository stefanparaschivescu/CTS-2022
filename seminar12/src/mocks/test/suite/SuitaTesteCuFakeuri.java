package mocks.test.suite;

import mocks.test.categorii.CategorieUtilizareBoundary;
import mocks.test.categorii.CategorieUtilizareFake;
import mocks.test.test.TestAgentieDubluri;
import mocks.test.test.TestPachetTuristic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestAgentieDubluri.class, TestPachetTuristic.class})
@Categories.IncludeCategory(CategorieUtilizareFake.class)
@Categories.ExcludeCategory(CategorieUtilizareBoundary.class)
public class SuitaTesteCuFakeuri {

}
