package org.vaadin.pontus;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

public class AbstractCameraView extends PolymerTemplate<TemplateModel>
        implements HasDataReceiver {

    @Id("camera")
    private VCamera camera;

    File latest;

    public AbstractCameraView() {
        camera.setReceiver(this);

        Map<String, Object> previewOpts = new HashMap<>();
        previewOpts.put("video", true);

        Map<String, Object> recOpts = new HashMap<>();
        recOpts.put("video", true);
        recOpts.put("audio", true);
        camera.setOptions(previewOpts, recOpts);
    }

    public VCamera getCamera() {
        return camera;
    }

    @Override
    public File getLatest() {
        return latest;
    }

    @Override
    public void setLatest(File file) {
        latest = file;
    }

}
