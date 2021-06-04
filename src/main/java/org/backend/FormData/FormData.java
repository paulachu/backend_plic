package org.backend.FormData;


import org.jboss.resteasy.annotations.providers.multipart.PartType;

import javax.ws.rs.core.MediaType;
import java.io.File;

public class FormData {
    public FormData(String name, String type, File file) {
        this.name = name;
        this.type = type;
        this.file = file;
    }

    public String name;
    public String type;
    public File file;
}
