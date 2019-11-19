package life.majiang.community.entity;
//序列化Date用的
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import sun.plugin2.message.Serializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class CustomDateTimeSerializer extends JsonSerializer<Date> {
    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers)
                throws IOException, JsonProcessingException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        gen.writeString(sdf.format(value));
    }
}
