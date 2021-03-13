package .com.example.text;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;



@DesignerComponent(
  version = 1,
  description = "This is our test/exam. lets pass it and score 95 percent.",
  category = ComponentCategory.EXTENSION,
  nonVisible = true,
  iconName = "")

@SimpleObject(external = true)
public final class Test extends AndroidNonvisibleComponent {
	
  public final String BUILD_VERSION = Build.VERSION;
  
  public Test(ComponentContainer container) {
    super(container.$form());
	

  }

	
}