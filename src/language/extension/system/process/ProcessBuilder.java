package language.extension.system.process;

import java.io.File;
import java.io.IOException;
import java.lang.Process;
import java.util.List;
import java.util.Map;

/**
 * This class is used to create operating system processes.
 *
 * <code>
 *     ProcessBuilder pb = new ProcessBuilder("myCommand", "myArg1", "myArg2");
 *     Map<String, String> env = pb.environment();
 *     env.put("VAR1", "myValue");
 *     env.remove("OTHERVAR");
 *     pb.directory(new File("myDir"));
 *     File log = new File("log");
 *     pb.redirectErrorStream(true);
 *     pb.redirectOutput(Redirect.appendTo(log));
 *     Process p = pb.start();
 *     assert pb.redirectInput() == Redirect.PIPE;
 *     assert pb.redirectOutput().file() == log;
 *     assert p.getInputStream().read() == -1;
 * </code>
 *
 * @see java.lang.ProcessBuilder
 */
public final class ProcessBuilder {
    private java.lang.ProcessBuilder $this;

    public ProcessBuilder(List<String> command) { $this = new java.lang.ProcessBuilder(command); }
    public ProcessBuilder(String... command) { $this = new java.lang.ProcessBuilder(command); }

    public java.lang.ProcessBuilder command(List<String> command) { return $this.command(command); }
    public java.lang.ProcessBuilder command(String... command){ return $this.command(command); }
    public List<String> command(){ return $this.command(); }

    public Process start() throws IOException {return $this.start();}
    public static List<Process> startPipeline(List<java.lang.ProcessBuilder> builders) throws IOException {return java.lang.ProcessBuilder.startPipeline(builders);}

    public Map<String,String> environment(){ return $this.environment(); }
    public File directory(){ return $this.directory(); }
    public java.lang.ProcessBuilder directory(File directory){ return $this.directory(directory); }

    public abstract static class Redirect{
        java.lang.ProcessBuilder.Redirect $this;
        private Redirect(){}
        public enum Type {
            PIPE,INHERIT,READ,WRITE,APPEND
        }
        public static final java.lang.ProcessBuilder.Redirect PIPE = java.lang.ProcessBuilder.Redirect.PIPE;
        public static final java.lang.ProcessBuilder.Redirect INHERIT = java.lang.ProcessBuilder.Redirect.INHERIT;
        public static final java.lang.ProcessBuilder.Redirect DISCARD = java.lang.ProcessBuilder.Redirect.DISCARD;

        public abstract java.lang.ProcessBuilder.Redirect.Type type();
        public File file() { return null; }
        public static java.lang.ProcessBuilder.Redirect from(final File file) {return java.lang.ProcessBuilder.Redirect.from(file);}
        public static java.lang.ProcessBuilder.Redirect to(final File file) {return java.lang.ProcessBuilder.Redirect.to(file);}
        public static java.lang.ProcessBuilder.Redirect appendTo(final File file) {return java.lang.ProcessBuilder.Redirect.appendTo(file);}
        public boolean equals(Object obj){return $this.equals(obj);}
        public int hashCode() {return $this.hashCode();}
    }

    public java.lang.ProcessBuilder redirectInput(java.lang.ProcessBuilder.Redirect source) {return $this.redirectInput(source);}
    public java.lang.ProcessBuilder redirectOutput(java.lang.ProcessBuilder.Redirect destination) {return $this.redirectOutput(destination);}
    public java.lang.ProcessBuilder redirectError(java.lang.ProcessBuilder.Redirect destination) {return $this.redirectError(destination);}
    public java.lang.ProcessBuilder redirectInput(File file){return $this.redirectInput(file);}
    public java.lang.ProcessBuilder redirectOutput(File file){return $this.redirectOutput(file);}
    public java.lang.ProcessBuilder redirectError(File file){return $this.redirectError(file);}
    public java.lang.ProcessBuilder.Redirect redirectInput(){return $this.redirectInput();}
    public java.lang.ProcessBuilder.Redirect redirectOutput(){return $this.redirectOutput();}
    public java.lang.ProcessBuilder.Redirect redirectError(){return $this.redirectError();}

    public java.lang.ProcessBuilder inheritIO(){return $this.inheritIO();}
    public boolean redirectErrorStream(){return $this.redirectErrorStream();}
    public java.lang.ProcessBuilder redirectErrorStream(boolean redirectErrorStream){return $this.redirectErrorStream(redirectErrorStream);}

}
