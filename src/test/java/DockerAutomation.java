import org.testng.annotations.Test;

import java.io.IOException;

public class DockerAutomation {
@Test
    public  void startingDocker() throws IOException {
       Runtime run=Runtime.getRuntime();
        run.exec("cmd /c start dockerUp.bat");
        System.out.println("Docker started");

    }
}
  // <groupId>org.example</groupId>
// *<artifactId>DockerImplementation</artifactId>
//  <version>1.0-SNAPSHOT</version> * //
