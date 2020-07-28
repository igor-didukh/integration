
interface Functions {
    String getName();
    double getLimit();
    double f(double x);
}

class f1 implements Functions {
    @Override
    public String getName() {
        return "log(x+1)";
    }
    
    @Override
    public double getLimit() {
        return 5;
    }
    
    @Override
    public double f(double x) {
        return Math.log(x+1);
    }
}

class f2 implements Functions {
    @Override
    public String getName() {
        return "sqrt(x)";
    }
    
    @Override
    public double getLimit() {
        return 3;
    }
    
    @Override
    public double f(double x) {
        return Math.sqrt(x);
    }
}

class f3 implements Functions {
    @Override
    public String getName() {
        return "atan(x)";
    }
    
    @Override
    public double getLimit() {
        return 2.5;
    }
    
    @Override
    public double f(double x) {
        return Math.atan(x);
    }
}

class f4 implements Functions {
    private final int[] a = {1,2,-5,3,-1};
	
    private String sign(int i) {
        if (i == 0 & a[i] > 0) return "";
        return a[i] < 0 ? "-" : "+";
    }

    private String coef(int i) {
        if (i != a.length-1 & Math.abs(a[i]) == 1) return "";
        return "" + Math.abs(a[i]);
    }

    private String power(int i) {
        if (i == a.length-1) return "";
        if (i == a.length-2) return "x";
        return "x^" + (a.length - 1 - i);
    }
    
    @Override
    public String getName() {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] !=0)
               s += "" + sign(i) + coef(i) + power(i);
        }
        return s;
    }
    
    @Override
    public double getLimit() {
        return 12;
    }
    
    @Override
    public double f(double x) {
        double result = a[0];
        for (int i = 1; i < a.length; i++) {
            result *= x;
            result += a[i];
        }
        return result;
    }
}