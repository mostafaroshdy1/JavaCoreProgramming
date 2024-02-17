@FunctionalInterface
public interface Convert<T,R>{
  R convert(T num);
}
