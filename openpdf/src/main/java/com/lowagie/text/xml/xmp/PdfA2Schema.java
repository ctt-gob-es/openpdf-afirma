package com.lowagie.text.xml.xmp;

/**
 * An implementation of an XmpSchema.
 */
class PdfA2Schema extends XmpSchema {

    private static final long serialVersionUID = 5300646133692948168L;
    /** default namespace identifier*/
    private static final String DEFAULT_XPATH_ID = "pdfaid";
    /** default namespace uri*/
    private static final String DEFAULT_XPATH_URI = "http://www.aiim.org/pdfa/ns/id/";

    /** Part, always 1. */
    private static final String PART = "pdfaid:part";
    /** Conformance, A or B. */
    private static final String CONFORMANCE = "pdfaid:conformance";

    public PdfA2Schema() {
        super("xmlns:" + DEFAULT_XPATH_ID + "=\"" + DEFAULT_XPATH_URI + "\"");
        addPart("2");
    }

    /**
     * Adds part.
     * @param part
     */
    private void addPart(final String part) {
        setProperty(PART, part);
    }

    /**
     * Adds the conformance.
     * @param conformance
     */
    public void addConformance(final String conformance) {
        setProperty(CONFORMANCE, conformance);
    }
}
