package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public final class RevisionFormatter {

    public String format(Revision revision) {
        Instant timestamp = revision.timestamp;
        ZoneId zoneId = ZoneId.of("Etc/UTC");
        ZonedDateTime zoneDateTime = timestamp.atZone(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        formatter = formatter.withLocale(Locale.US);

        return String.format("%s made a change at %s",
                revision.name,
                zoneDateTime.format(formatter)
                );
    }
    
}
