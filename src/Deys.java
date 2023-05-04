import java.sql.SQLOutput;

public enum Deys {
    MONDAY{
        @Override
        public void method() {
            System.out.println("Дуйшомбу куну теориялык сабак");

        }
    },
    TUESDAY{
        @Override
        public void method() {
            System.out.println("Шейшемби куну практикалык сабак");

        }
    },
    WEDNESDAY{
        @Override
        public void method() {
            System.out.println("Шаршемби куну кайра эле теориялык сабак");
        }
    },
    THURSDAY{
        @Override
        public void method() {
            System.out.println("Бейшемби кункуго Англиский сабагы кошулат");
        }
    },
    FRIDAY{
        @Override
        public void method() {
            System.out.println("Жума куну теориялык сабак");
        }
    },
    SATURDAY{
        @Override
        public void method() {
            System.out.println("Ишемби куну практикалык сабак\n");
        }
    },
    SANDAY{
        @Override
        public void method() {
            System.out.println("Жекшемби куну дем алуу сабагы");
        }
    };


    public abstract void method();
}
