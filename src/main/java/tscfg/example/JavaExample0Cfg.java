// generated by tscfg 0.3.3 on Thu Aug 25 22:26:32 PDT 2016
// source: example/example0.spec.conf

package tscfg.example;

public class JavaExample0Cfg {
  public final Service service;
  public static class Service {
    public final boolean debug;
    public final double factor;
    public final int poolSize;
    public final String url;
    public Service(com.typesafe.config.Config c) {
      this.debug = c != null && c.hasPathOrNull("debug") ? c.getBoolean("debug") : true;
      this.factor = c != null && c.hasPathOrNull("factor") ? c.getDouble("factor") : 0.75;
      this.poolSize = c != null && c.hasPathOrNull("poolSize") ? c.getInt("poolSize") : 32;
      this.url = c != null && c.hasPathOrNull("url") ? c.getString("url") : "http://example.net/rest";
    }
    public String toString() { return toString(""); }
    public String toString(String i) {
      return i+ "debug = " + this.debug + "\n"
          +i+ "factor = " + this.factor + "\n"
          +i+ "poolSize = " + this.poolSize + "\n"
          +i+ "url = " + '"' + this.url + '"' + "\n";
    }
  }
  public JavaExample0Cfg(com.typesafe.config.Config c) {
    this.service = new Service(__$config(c, "service"));
  }
  public String toString() { return toString(""); }
  public String toString(String i) {
    return i+ "service {\n" + this.service.toString(i+"    ") +i+ "}\n";
  }
  private static com.typesafe.config.Config __$config(com.typesafe.config.Config c, String path) {
    return c != null && c.hasPath(path) ? c.getConfig(path) : null;
  }
}