import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyPaste_2 {

    public static void main(String[] args) {
    	
    	// Here, I define user only can enter one argument, not more than one or anyone.
    	if (args.length > 2 ) {
    		System.out.println("You enter more than one argument. Bye!");
    	}
    	
    	else if (args.length < 2) {
    		System.out.println("You don't enter a argument. Bye!");
    	}

        Path origin = FileSystems.getDefault().getPath(args[0]);
        Path destiny = FileSystems.getDefault().getPath(args[1]);

        try {
            Files.move(origin, destiny, StandardCopyOption.REPLACE_EXISTING);
        } 
        
        catch (IOException e) {
            System.err.println(e);
        }

    }

}