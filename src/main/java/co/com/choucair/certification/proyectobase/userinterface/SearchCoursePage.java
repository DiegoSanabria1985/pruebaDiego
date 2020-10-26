

package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

//@DefaultUrl("https://operacion.choucairtesting.com/academy/my/")
public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Select course")
            .located(By.xpath("//div[@id = 'certificaciones']"));
    public static final Target INPUT_COURSE = Target.the("search course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the(" click to search the course ")
            .located(By.xpath("//button[@class = 'btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("select search course")
            .located(By.xpath("//*[@id=\"category-course-list\"]/div/div[2]/div/div/div/div/a/div[2]/h4"));


}
