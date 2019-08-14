public class Time {

    private int mHour;
    private int mMinute;
    private int mSecond;

    private Time(Builder builder) {
        mHour = builder.hour;
        mMinute = builder.minute;
        mSecond = builder.second;
    }

    public static class Builder {
        private int hour;
        private int minute;
        private int second;

        public Builder setHour(int hour) {
            this.hour = hour;
            return this;
        }

        public Builder setMinute(int minute) {
            this.minute = minute;
            return this;
        }

        public Builder setSecond(int second) {
            this.second = second;
            return this;
        }

        public Builder() {
        }

        public Time build() {
            return new Time(this);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(mHour) + ":" + String.valueOf(mMinute) + ":" + String.valueOf(mSecond);
    }

    public static void main(String[] args) {
        Time time = new Time.Builder().setHour(10).setMinute(10).setSecond(10).build();
        System.out.println(time);
    }
}
