package com.datafaber.crashplan;

import freemarker.template.*;
import org.joda.time.base.AbstractInstant;

/**
 * Extends Freemarker's ObjectWrapper with support for Joda Time DateTime types
 */
public class JodaAwareObjectWrapper extends DefaultObjectWrapper {

  /**
   * Wraps an object for use with Freemarker
   * @param pObj object
   * @return wrapped object
   * @throws TemplateModelException if errors
   */
  @Override
  public TemplateModel wrap (Object pObj) throws TemplateModelException {
    if (pObj == null) {
      return super.wrap(pObj);
    }
    if (pObj instanceof AbstractInstant) {
      return new SimpleDate(((AbstractInstant)pObj).toDate(), TemplateDateModel.DATETIME);
    }
    return super.wrap(pObj);
  }

}
