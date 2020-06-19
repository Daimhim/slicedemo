package twoguards.compiler

import com.google.auto.service.AutoService
import twoguards.annotation.BuriedPointEvent
import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.AnnotationMirror
import javax.lang.model.element.Element
import javax.lang.model.element.ExecutableElement
import javax.lang.model.element.TypeElement

@AutoService(Processor::class)
class TwoGuardsProcessor : AbstractProcessor() {

    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        print("TwoGuardsProcessor getSupportedAnnotationTypes")
        return mutableSetOf(BuriedPointEvent::class.java.simpleName)
    }
    override fun process(p0: MutableSet<out TypeElement>?, p1: RoundEnvironment?): Boolean {
        print("TwoGuardsProcessor process")
        return false
    }

    override fun getSupportedOptions(): MutableSet<String> {
        print("TwoGuardsProcessor getSupportedOptions")
        return super.getSupportedOptions()
    }

    override fun isInitialized(): Boolean {
        print("TwoGuardsProcessor isInitialized")
        return super.isInitialized()
    }

    override fun getCompletions(
        p0: Element?,
        p1: AnnotationMirror?,
        p2: ExecutableElement?,
        p3: String?
    ): MutableIterable<Completion> {
        print("TwoGuardsProcessor getCompletions")
        return super.getCompletions(p0, p1, p2, p3)
    }

    override fun getSupportedSourceVersion(): SourceVersion {
        print("TwoGuardsProcessor getSupportedSourceVersion")
        return SourceVersion.latestSupported()
    }

    override fun init(p0: ProcessingEnvironment?) {
        print("TwoGuardsProcessor init")
        super.init(p0)
    }
}