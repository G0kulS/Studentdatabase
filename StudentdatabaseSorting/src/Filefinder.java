import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Filefinder extends SimpleFileVisitor<Path> {
    private String file;
    private Path result = null;

    public Filefinder(String file) {
        this.file = file;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        if (dir.getFileName() != null) {
            if (FiletoSkip.presentInDirList(dir.getFileName().toString())) {
                return FileVisitResult.SKIP_SUBTREE;
            }
            // System.out.println("Searching directories :"+dir.getFileName());
        }
        return FileVisitResult.CONTINUE;

    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().equals(this.file)) {
            System.out.println("File Found");
            System.out.println(file.toAbsolutePath());
            result = file;
            return FileVisitResult.TERMINATE;
        } else {
            //System.out.println("Searching : "+file.toAbsolutePath());
            return FileVisitResult.CONTINUE;
        }
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    private Boolean checkdir(Path dir) {
        String d1;
        if (dir.getFileName() == null) {
            return true;
        }
        d1 = dir.getFileName().toString();
        Boolean result = FiletoSkip.presentInDirList(d1);
        //System.out.println(result);
        return result;
    }

    public Path returningPath()
    {
       return result;
    }
}

