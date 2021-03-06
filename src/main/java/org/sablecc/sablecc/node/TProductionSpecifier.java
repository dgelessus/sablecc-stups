/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import org.sablecc.sablecc.analysis.*;

public final class TProductionSpecifier extends Token
{
  public TProductionSpecifier()
  {
    super.setText("P");
  }

  public TProductionSpecifier(int line, int pos)
  {
    super.setText("P");
    setLine(line);
    setPos(pos);
  }

  public Object clone()
  {
    return new TProductionSpecifier(getLine(), getPos());
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseTProductionSpecifier(this);
  }

  public void setText(String text)
  {
    throw new RuntimeException("Cannot change TProductionSpecifier text.");
  }
}
