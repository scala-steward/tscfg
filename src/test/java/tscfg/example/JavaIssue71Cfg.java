package tscfg.example;

public class JavaIssue71Cfg {
  public final JavaIssue71Cfg.Example example;
  public static class Shared {
    public final java.lang.String c;
    public final Shared.D d;
    public static class D {
      public final int e;
      
      public D(com.typesafe.config.Config c, java.lang.String parentPath, $TsCfgValidator $tsCfgValidator) {
        this.e = $_reqInt(parentPath, c, "e", $tsCfgValidator);
      }
      private static int $_reqInt(java.lang.String parentPath, com.typesafe.config.Config c, java.lang.String path, $TsCfgValidator $tsCfgValidator) {
        if (c == null) return 0;
        try {
          return c.getInt(path);
        }
        catch(com.typesafe.config.ConfigException e) {
          $tsCfgValidator.addBadPath(parentPath + path, e);
          return 0;
        }
      }
    
    }
    
    public Shared(com.typesafe.config.Config c, java.lang.String parentPath, $TsCfgValidator $tsCfgValidator) {
      this.c = $_reqStr(parentPath, c, "c", $tsCfgValidator);
      this.d = c.hasPathOrNull("d") ? new Shared.D(c.getConfig("d"), parentPath + "d.", $tsCfgValidator) : new Shared.D(com.typesafe.config.ConfigFactory.parseString("d{}"), parentPath + "d.", $tsCfgValidator);
    }
    private static java.lang.String $_reqStr(java.lang.String parentPath, com.typesafe.config.Config c, java.lang.String path, $TsCfgValidator $tsCfgValidator) {
      if (c == null) return null;
      try {
        return c.getString(path);
      }
      catch(com.typesafe.config.ConfigException e) {
        $tsCfgValidator.addBadPath(parentPath + path, e);
        return null;
      }
    }
  
  }
  
  public static class Shared2 {
    public final java.lang.String dd;
    public final Shared2.Dddd dddd;
    public static class Dddd {
      public final int eeee;
      
      public Dddd(com.typesafe.config.Config c, java.lang.String parentPath, $TsCfgValidator $tsCfgValidator) {
        this.eeee = $_reqInt(parentPath, c, "eeee", $tsCfgValidator);
      }
      private static int $_reqInt(java.lang.String parentPath, com.typesafe.config.Config c, java.lang.String path, $TsCfgValidator $tsCfgValidator) {
        if (c == null) return 0;
        try {
          return c.getInt(path);
        }
        catch(com.typesafe.config.ConfigException e) {
          $tsCfgValidator.addBadPath(parentPath + path, e);
          return 0;
        }
      }
    
    }
    
    public Shared2(com.typesafe.config.Config c, java.lang.String parentPath, $TsCfgValidator $tsCfgValidator) {
      this.dd = $_reqStr(parentPath, c, "dd", $tsCfgValidator);
      this.dddd = c.hasPathOrNull("dddd") ? new Shared2.Dddd(c.getConfig("dddd"), parentPath + "dddd.", $tsCfgValidator) : new Shared2.Dddd(com.typesafe.config.ConfigFactory.parseString("dddd{}"), parentPath + "dddd.", $tsCfgValidator);
    }
    private static java.lang.String $_reqStr(java.lang.String parentPath, com.typesafe.config.Config c, java.lang.String path, $TsCfgValidator $tsCfgValidator) {
      if (c == null) return null;
      try {
        return c.getString(path);
      }
      catch(com.typesafe.config.ConfigException e) {
        $tsCfgValidator.addBadPath(parentPath + path, e);
        return null;
      }
    }
  
  }
  
  public static class Example {
    public final Shared a;
    public final java.util.List<Shared> b;
    public final java.util.List<Shared2> c;
    
    public Example(com.typesafe.config.Config c, java.lang.String parentPath, $TsCfgValidator $tsCfgValidator) {
      this.a = c.hasPathOrNull("a") ? new Shared(c.getConfig("a"), parentPath + "a.", $tsCfgValidator) : new Shared(com.typesafe.config.ConfigFactory.parseString("a{}"), parentPath + "a.", $tsCfgValidator);
      this.b = $_LShared(c.getList("b"), parentPath, $tsCfgValidator);
      this.c = $_LShared2(c.getList("c"), parentPath, $tsCfgValidator);
    }
    private static java.util.List<Shared> $_LShared(com.typesafe.config.ConfigList cl, java.lang.String parentPath, $TsCfgValidator $tsCfgValidator) {
      java.util.ArrayList<Shared> al = new java.util.ArrayList<>();
      for (com.typesafe.config.ConfigValue cv: cl) {
        al.add(new Shared(((com.typesafe.config.ConfigObject)cv).toConfig(), parentPath, $tsCfgValidator));
      }
      return java.util.Collections.unmodifiableList(al);
    }
    private static java.util.List<Shared2> $_LShared2(com.typesafe.config.ConfigList cl, java.lang.String parentPath, $TsCfgValidator $tsCfgValidator) {
      java.util.ArrayList<Shared2> al = new java.util.ArrayList<>();
      for (com.typesafe.config.ConfigValue cv: cl) {
        al.add(new Shared2(((com.typesafe.config.ConfigObject)cv).toConfig(), parentPath, $tsCfgValidator));
      }
      return java.util.Collections.unmodifiableList(al);
    }
  }
  
  public JavaIssue71Cfg(com.typesafe.config.Config c) {
    final $TsCfgValidator $tsCfgValidator = new $TsCfgValidator();
    final java.lang.String parentPath = "";
    this.example = c.hasPathOrNull("example") ? new JavaIssue71Cfg.Example(c.getConfig("example"), parentPath + "example.", $tsCfgValidator) : new JavaIssue71Cfg.Example(com.typesafe.config.ConfigFactory.parseString("example{}"), parentPath + "example.", $tsCfgValidator);
    $tsCfgValidator.validate();
  }
  private static final class $TsCfgValidator  {
    private final java.util.List<java.lang.String> badPaths = new java.util.ArrayList<>();
    
    void addBadPath(java.lang.String path, com.typesafe.config.ConfigException e) {
      badPaths.add("'" + path + "': " + e.getClass().getName() + "(" + e.getMessage() + ")");
    }
    
    void validate() {
      if (!badPaths.isEmpty()) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid configuration:");
        for (java.lang.String path : badPaths) {
          sb.append("\n    ").append(path);
        }
        throw new com.typesafe.config.ConfigException(sb.toString()) {};
      }
    }
  }
}
