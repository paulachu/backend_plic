package org.backend.FormData;


import org.jboss.resteasy.reactive.PartType;
import org.jboss.resteasy.reactive.RestForm;
import org.jboss.resteasy.reactive.multipart.FileUpload;

import javax.ws.rs.core.MediaType;
import java.io.File;

public class FormData {
    @RestForm
    @PartType(MediaType.TEXT_PLAIN)
    public String name;
    @RestForm
    @PartType(MediaType.TEXT_PLAIN)
    public String type;
    @RestForm("file")
    public File file;
}
