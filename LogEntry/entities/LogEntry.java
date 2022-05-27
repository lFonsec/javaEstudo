package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
    public String name;
    public Date date;



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LogEntry)) {
            return false;
        }
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(name, logEntry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LogEntry(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public LogEntry() {
    }
    
}
