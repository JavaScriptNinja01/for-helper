import com.example.forhelper.For;

public class ForHelper<T> {
    private T[] array;
    private For<T> forLoop;

    public ForHelper(T[] array) {
        this.array = array;
        this.forLoop = For.each(array);
    }

    public void forEach(LoopBody<T> loopBody) {
        forLoop.forEach((index, item) -> loopBody.run(index, item));
    }

    public interface LoopBody<T> {
        void run(int index, T item);
    }
}
