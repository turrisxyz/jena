/* ShaclCompactParserJJ.java */
/* Generated By:JavaCC: Do not edit this line. ShaclCompactParserJJ.java */
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.shacl.compact.reader.parser;

import java.util.List;
import java.util.ArrayList;
import org.apache.jena.graph.*;
import org.apache.jena.sparql.path.*;
import org.apache.jena.shacl.compact.reader.*;
import static org.apache.jena.riot.lang.extra.LangParserLib.*;

public class ShaclCompactParserJJ extends ShaclCompactParser implements ShaclCompactParserJJConstants {

  final public void Unit() throws ParseException {
    ByteOrderMark();
    shaclDoc();
    jj_consume_token(0);
  }

  final public void ByteOrderMark() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case BOM:{
      jj_consume_token(BOM);
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      ;
    }
  }

  final public void shaclDoc() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BASE:
      case IMPORTS:
      case PREFIX:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      directive();
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SHAPE_CLASS:
      case SHAPE:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SHAPE:{
        nodeShape();
        break;
        }
      case SHAPE_CLASS:{
        shapeClass();
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void directive() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case BASE:{
      baseDecl();
      break;
      }
    case PREFIX:{
      prefixDecl();
      break;
      }
    case IMPORTS:{
      importDecl();
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void baseDecl() throws ParseException {String iri ;
    jj_consume_token(BASE);
    iri = IRIREF();
rBase(iri) ;
  }

  final public void prefixDecl() throws ParseException {Token t ; String iri ;
    jj_consume_token(PREFIX);
    t = jj_consume_token(PNAME_NS);
    iri = IRIREF();
String s = canonicalPrefix(t.image, t.beginLine, t.beginColumn) ;
      rPrefix(s, iri);
  }

  final public void importDecl() throws ParseException {String iri ;
    jj_consume_token(IMPORTS);
    iri = iri();
rImports(iri);
  }

  final public void nodeShape() throws ParseException {String iri;
startNodeShape();
    jj_consume_token(SHAPE);
    iri = iri();
rNodeShape(iri);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 1:{
      targetClass();
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    nodeShapeBody();
finishNodeShape();
  }

  final public void shapeClass() throws ParseException {String iri;
startShapeClass();
    jj_consume_token(SHAPE_CLASS);
    iri = iri();
rShapeClass(iri);
    nodeShapeBody();
finishShapeClass();
  }

  final public void targetClass() throws ParseException {String iri;
    jj_consume_token(1);
    label_3:
    while (true) {
      iri = iri();
rTargetClass(iri);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IRIref:
      case PNAME_NS:
      case PNAME_LN:{
        ;
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        break label_3;
      }
    }
  }

  final public void nodeShapeBody() throws ParseException {
startNodeShapeBody() ;
    jj_consume_token(LBRACE);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case AT:
      case CARAT:
      case BANG:
      case LPAREN:
      case IRIref:
      case PNAME_NS:
      case PNAME_LN:
      case ATPNAME_NS:
      case ATPNAME_LN:{
        ;
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        break label_4;
      }
      constraint();
    }
    jj_consume_token(RBRACE);
finishNodeShapeBody() ;
  }

  final public void constraint() throws ParseException {
startConstraint();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 24:
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    case 32:
    case 33:
    case BANG:{
      label_5:
      while (true) {
        nodeOr();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 24:
        case 25:
        case 26:
        case 27:
        case 28:
        case 29:
        case 30:
        case 31:
        case 32:
        case 33:
        case BANG:{
          ;
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          break label_5;
        }
      }
      break;
      }
    case CARAT:
    case LPAREN:
    case IRIref:
    case PNAME_NS:
    case PNAME_LN:{
      propertyShape();
      break;
      }
    case AT:
    case ATPNAME_NS:
    case ATPNAME_LN:{
      shapeRef(false);
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
finishConstraint() ;
    jj_consume_token(DOT);
  }

  final public void nodeOr() throws ParseException {
startNodeOr();
rNodeOr_pre();
    nodeNot();
rNodeOr_post();
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VBAR:{
        ;
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        break label_6;
      }
      jj_consume_token(VBAR);
rNodeOr_pre();
      nodeNot();
rNodeOr_post();
    }
finishNodeOr();
  }

  final public void nodeNot() throws ParseException {boolean b = false;
startNodeNot();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case BANG:{
      negation();
b = true;
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      ;
    }
beginNodeNot(b);
    nodeValue();
finishNodeNot(b);
  }

  final public void negation() throws ParseException {
    jj_consume_token(BANG);
  }

  final public void nodeValue() throws ParseException {String s; Node n; List<Node> x;
    s = nodeParam();
    jj_consume_token(EQUALS);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:
    case FALSE:
    case IRIref:
    case PNAME_NS:
    case PNAME_LN:
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
    case INTEGER:
    case DECIMAL:
    case DOUBLE:{
      n = iriOrLiteral();
rNodeValue(s, n);
      break;
      }
    case LBRACKET:{
      x = array();
rNodeValue(s, x);
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void propertyShape() throws ParseException {Path p ;
startPropertyShape();
    p = path();
rPropertyShape(p);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case AT:
      case BANG:
      case LBRACE:
      case LBRACKET:
      case IRIref:
      case PNAME_NS:
      case PNAME_LN:
      case ATPNAME_NS:
      case ATPNAME_LN:{
        ;
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LBRACKET:{
        propertyCount();
        break;
        }
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case AT:
      case BANG:
      case LBRACE:
      case IRIref:
      case PNAME_NS:
      case PNAME_LN:
      case ATPNAME_NS:
      case ATPNAME_LN:{
        propertyOr();
        break;
        }
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
finishPropertyShape();
  }

  final public void propertyOr() throws ParseException {
startPropertyOr();
rPropertyOr_pre();
    propertyNot();
rPropertyOr_post();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VBAR:{
        ;
        break;
        }
      default:
        jj_la1[15] = jj_gen;
        break label_8;
      }
      jj_consume_token(VBAR);
rPropertyOr_pre();
      propertyNot();
rPropertyOr_post();
    }
finishPropertyOr();
  }

  final public void propertyNot() throws ParseException {boolean b = false;
startPropertyNot();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case BANG:{
      negation();
b = true;
      break;
      }
    default:
      jj_la1[16] = jj_gen;
      ;
    }
beginPropertyNot(b);
    propertyAtom();
finishPropertyNot(b);
  }

  final public void propertyAtom() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IRIref:
    case PNAME_NS:
    case PNAME_LN:{
      propertyType();
      break;
      }
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:{
      nodeKind();
      break;
      }
    case AT:
    case ATPNAME_NS:
    case ATPNAME_LN:{
      shapeRef(true);
      break;
      }
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 24:
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    case 32:
    case 33:{
      propertyValue();
      break;
      }
    case LBRACE:{
startNestedPropertyAtom();
      nodeShapeBody();
finishNestedPropertyAtom();
      break;
      }
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void propertyCount() throws ParseException {String s1, s2;
    jj_consume_token(LBRACKET);
    s1 = propertyMinCount();
    jj_consume_token(2);
    s2 = propertyMaxCount();
    jj_consume_token(RBRACKET);
rPropertyCount(s1, s2);
  }

  final public String propertyMinCount() throws ParseException {Token t;
    t = jj_consume_token(INTEGER);
{if ("" != null) return t.image;}
    throw new Error("Missing return statement in function");
  }

  final public String propertyMaxCount() throws ParseException {Token t;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEGER:{
      t = jj_consume_token(INTEGER);
      break;
      }
    case STAR:{
      t = jj_consume_token(STAR);
      break;
      }
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return t.image;}
    throw new Error("Missing return statement in function");
  }

  final public void propertyType() throws ParseException {String iriStr;
    iriStr = iri();
rPropertyType(iriStr);
  }

  final public void nodeKind() throws ParseException {Token t;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 3:{
      t = jj_consume_token(3);
      break;
      }
    case 4:{
      t = jj_consume_token(4);
      break;
      }
    case 5:{
      t = jj_consume_token(5);
      break;
      }
    case 6:{
      t = jj_consume_token(6);
      break;
      }
    case 7:{
      t = jj_consume_token(7);
      break;
      }
    case 8:{
      t = jj_consume_token(8);
      break;
      }
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
rNodeKind(t.image);
  }

  final public void shapeRef(boolean inPropertyShape) throws ParseException {Token t; String iriStr;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ATPNAME_LN:{
      t = jj_consume_token(ATPNAME_LN);
iriStr = resolvePName(t.image.substring(1), t.beginLine, t.beginColumn) ;
      break;
      }
    case ATPNAME_NS:{
      t = jj_consume_token(ATPNAME_NS);
iriStr = resolvePName(t.image.substring(1), t.beginLine, t.beginColumn) ;
      break;
      }
    case AT:{
      jj_consume_token(AT);
      iriStr = IRIREF();
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
rShapeRef(inPropertyShape, iriStr);
  }

  final public void propertyValue() throws ParseException {String s; Node n; List<Node> x;
    s = nodeParam();
    jj_consume_token(EQUALS);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:
    case FALSE:
    case IRIref:
    case PNAME_NS:
    case PNAME_LN:
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
    case INTEGER:
    case DECIMAL:
    case DOUBLE:{
      n = iriOrLiteral();
rParamValue(s, n);
      break;
      }
    case LBRACKET:{
      x = array();
rParamValue(s, x);
      break;
      }
    default:
      jj_la1[21] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

// Assemble items to build with from hereon down.
// Return Java objects.
  final public 
String nodeParam() throws ParseException {Token t ;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 9:{
      t = jj_consume_token(9);
      break;
      }
    case 10:{
      t = jj_consume_token(10);
      break;
      }
    case 11:{
      t = jj_consume_token(11);
      break;
      }
    case 12:{
      // <EXT>
          // Extension for symmetry!
          t = jj_consume_token(12);
      break;
      }
    case 13:{
      // </EXT>
          t = jj_consume_token(13);
      break;
      }
    case 14:{
      t = jj_consume_token(14);
      break;
      }
    case 15:{
      t = jj_consume_token(15);
      break;
      }
    case 16:{
      t = jj_consume_token(16);
      break;
      }
    case 17:{
      t = jj_consume_token(17);
      break;
      }
    case 18:{
      t = jj_consume_token(18);
      break;
      }
    case 19:{
      t = jj_consume_token(19);
      break;
      }
    case 20:{
      t = jj_consume_token(20);
      break;
      }
    case 21:{
      t = jj_consume_token(21);
      break;
      }
    case 22:{
      t = jj_consume_token(22);
      break;
      }
    case 23:{
      t = jj_consume_token(23);
      break;
      }
    case 24:{
      t = jj_consume_token(24);
      break;
      }
    case 25:{
      t = jj_consume_token(25);
      break;
      }
    case 26:{
      t = jj_consume_token(26);
      break;
      }
    case 27:{
      t = jj_consume_token(27);
      break;
      }
    case 28:{
      t = jj_consume_token(28);
      break;
      }
    case 29:{
      t = jj_consume_token(29);
      break;
      }
    case 30:{
      t = jj_consume_token(30);
      break;
      }
    case 31:{
      t = jj_consume_token(31);
      break;
      }
    case 32:{
      t = jj_consume_token(32);
      break;
      }
    case 33:{
      t = jj_consume_token(33);
      break;
      }
    default:
      jj_la1[22] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return t.image ;}
    throw new Error("Missing return statement in function");
  }

  final public String propertyParam() throws ParseException {Token t;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 13:{
      t = jj_consume_token(13);
      break;
      }
    case 14:{
      t = jj_consume_token(14);
      break;
      }
    case 15:{
      t = jj_consume_token(15);
      break;
      }
    case 16:{
      t = jj_consume_token(16);
      break;
      }
    case 17:{
      t = jj_consume_token(17);
      break;
      }
    case 18:{
      t = jj_consume_token(18);
      break;
      }
    case 19:{
      t = jj_consume_token(19);
      break;
      }
    case 20:{
      t = jj_consume_token(20);
      break;
      }
    case 21:{
      t = jj_consume_token(21);
      break;
      }
    case 22:{
      t = jj_consume_token(22);
      break;
      }
    case 23:{
      t = jj_consume_token(23);
      break;
      }
    case 24:{
      t = jj_consume_token(24);
      break;
      }
    case 25:{
      t = jj_consume_token(25);
      break;
      }
    case 26:{
      t = jj_consume_token(26);
      break;
      }
    case 27:{
      t = jj_consume_token(27);
      break;
      }
    case 34:{
      t = jj_consume_token(34);
      break;
      }
    case 28:{
      t = jj_consume_token(28);
      break;
      }
    case 29:{
      t = jj_consume_token(29);
      break;
      }
    case 35:{
      t = jj_consume_token(35);
      break;
      }
    case 36:{
      t = jj_consume_token(36);
      break;
      }
    case 37:{
      t = jj_consume_token(37);
      break;
      }
    case 38:{
      t = jj_consume_token(38);
      break;
      }
    case 39:{
      t = jj_consume_token(39);
      break;
      }
    case 40:{
      t = jj_consume_token(40);
      break;
      }
    case 30:{
      t = jj_consume_token(30);
      break;
      }
    case 31:{
      t = jj_consume_token(31);
      break;
      }
    case 32:{
      t = jj_consume_token(32);
      break;
      }
    case 33:{
      t = jj_consume_token(33);
      break;
      }
    case 41:{
      t = jj_consume_token(41);
      break;
      }
    case 42:{
      t = jj_consume_token(42);
      break;
      }
    case 43:{
      t = jj_consume_token(43);
      break;
      }
    case 44:{
      t = jj_consume_token(44);
      break;
      }
    case 45:{
      t = jj_consume_token(45);
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return t.image;}
    throw new Error("Missing return statement in function");
  }

// Paths - subset of SPARQL Paths - no negation, no path property sets.
  final public 
Path PathUnit() throws ParseException {Path p ;
    ByteOrderMark();
    p = path();
    jj_consume_token(0);
{if ("" != null) return p ;}
    throw new Error("Missing return statement in function");
  }

// Weakest outermost
  final public Path path() throws ParseException {Path p ;
    p = pathAlternative();
{if ("" != null) return p ;}
    throw new Error("Missing return statement in function");
  }

  final public Path pathAlternative() throws ParseException {Path p1 , p2 ;
    p1 = pathSequence();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VBAR:{
        ;
        break;
        }
      default:
        jj_la1[24] = jj_gen;
        break label_9;
      }
      jj_consume_token(VBAR);
      p2 = pathSequence();
p1 = PathFactory.pathAlt(p1, p2) ;
    }
{if ("" != null) return p1 ;}
    throw new Error("Missing return statement in function");
  }

  final public Path pathSequence() throws ParseException {Path p1 , p2 ;
    p1 = pathEltOrInverse();
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SLASH:{
        ;
        break;
        }
      default:
        jj_la1[25] = jj_gen;
        break label_10;
      }
      jj_consume_token(SLASH);
      p2 = pathEltOrInverse();
p1 = PathFactory.pathSeq(p1, p2) ;
    }
{if ("" != null) return p1;}
    throw new Error("Missing return statement in function");
  }

// Path unit element, no inverse
  final public Path pathElt() throws ParseException {String str ; Node n ; Path p ;
    p = pathPrimary();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PLUS:
    case QMARK:
    case STAR:{
      p = pathMod(p);
      break;
      }
    default:
      jj_la1[26] = jj_gen;
      ;
    }
{if ("" != null) return p ;}
    throw new Error("Missing return statement in function");
  }

// Path unit element, including inverse.
  final public Path pathEltOrInverse() throws ParseException {String str ; Node n ; Path p ;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LPAREN:
    case IRIref:
    case PNAME_NS:
    case PNAME_LN:{
      p = pathElt();
      break;
      }
    case CARAT:{
      jj_consume_token(CARAT);
      p = pathElt();
p = PathFactory.pathInverse(p) ;
      break;
      }
    default:
      jj_la1[27] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return p ;}
    throw new Error("Missing return statement in function");
  }

  final public Path pathMod(Path p) throws ParseException {long i1 ; long i2 ;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case QMARK:{
      jj_consume_token(QMARK);
{if ("" != null) return PathFactory.pathZeroOrOne(p) ;}
      break;
      }
    case STAR:{
      jj_consume_token(STAR);
{if ("" != null) return PathFactory.pathZeroOrMore1(p) ;}
      break;
      }
    case PLUS:{
      jj_consume_token(PLUS);
{if ("" != null) return PathFactory.pathOneOrMore1(p) ;}
      break;
      }
    default:
      jj_la1[28] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Path pathPrimary() throws ParseException {String str ; Path p ; Node n ;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IRIref:
    case PNAME_NS:
    case PNAME_LN:{
      str = iri();
n = createURI(str, token.beginLine, token.beginColumn) ; p = PathFactory.pathLink(n) ;
      break;
      }
    case LPAREN:{
      jj_consume_token(LPAREN);
      p = path();
      jj_consume_token(RPAREN);
      break;
      }
    default:
      jj_la1[29] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return p ;}
    throw new Error("Missing return statement in function");
  }

// To preserve types, use ( iriOrLiteral() | array() ) directly
// void iriOrLiteralOrArray() : {}
// {
//   (
//     { Node n = null; }
//     n = iriOrLiteral()
//     { iriOrLiteralOrArray(n); }
//   |
//     { List<Node> x = null; }
//     x = array()
//     { iriOrLiteralOrArray(x); }
//   )
// }
  final public 
List<Node> array() throws ParseException {List<Node> x = new ArrayList<Node>(); Node n = null;
    jj_consume_token(LBRACKET);
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case IRIref:
      case PNAME_NS:
      case PNAME_LN:
      case STRING_LITERAL1:
      case STRING_LITERAL2:
      case STRING_LITERAL_LONG1:
      case STRING_LITERAL_LONG2:
      case INTEGER:
      case DECIMAL:
      case DOUBLE:{
        ;
        break;
        }
      default:
        jj_la1[30] = jj_gen;
        break label_11;
      }
      n = iriOrLiteral();
x.add(n);
    }
    jj_consume_token(RBRACKET);
{if ("" != null) return x;}
    throw new Error("Missing return statement in function");
  }

// Term generation
  final public 
Node iriOrLiteral() throws ParseException {Node n; String uriStr;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IRIref:
    case PNAME_NS:
    case PNAME_LN:{
      uriStr = iri();
n = createURI(uriStr, token.beginLine, token.beginColumn);
      break;
      }
    case TRUE:
    case FALSE:
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
    case INTEGER:
    case DECIMAL:
    case DOUBLE:{
      n = literal();
      break;
      }
    default:
      jj_la1[31] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return n ;}
    throw new Error("Missing return statement in function");
  }

  final public Node literal() throws ParseException {Node n ;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:{
      n = rdfLiteral();
      break;
      }
    case INTEGER:
    case DECIMAL:
    case DOUBLE:{
      n = numericLiteral();
      break;
      }
    case TRUE:
    case FALSE:{
      n = booleanLiteral();
      break;
      }
    default:
      jj_la1[32] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return n;}
    throw new Error("Missing return statement in function");
  }

  final public Node booleanLiteral() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:{
      jj_consume_token(TRUE);
{if ("" != null) return XSD_TRUE ;}
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
{if ("" != null) return XSD_FALSE ;}
      break;
      }
    default:
      jj_la1[33] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Node numericLiteral() throws ParseException {Token t ;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEGER:{
      t = jj_consume_token(INTEGER);
{if ("" != null) return createLiteralInteger(t.image, token.beginLine, token.beginColumn) ;}
      break;
      }
    case DECIMAL:{
      t = jj_consume_token(DECIMAL);
{if ("" != null) return createLiteralDecimal(t.image, token.beginLine, token.beginColumn) ;}
      break;
      }
    case DOUBLE:{
      t = jj_consume_token(DOUBLE);
{if ("" != null) return createLiteralDouble(t.image, token.beginLine, token.beginColumn) ;}
      break;
      }
    default:
      jj_la1[34] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Node rdfLiteral() throws ParseException {Token t ; Token tLang; String lex = null ;
    lex = string();
t = token;
String lang = null ; String dt = null ;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 46:
    case LANGTAG:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LANGTAG:{
        tLang = jj_consume_token(LANGTAG);
lang = stripChars(tLang.image, 1) ;
        break;
        }
      case 46:{
        jj_consume_token(46);
        dt = datatype();
        break;
        }
      default:
        jj_la1[35] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[36] = jj_gen;
      ;
    }
{if ("" != null) return createLiteral(lex, lang, dt, t.beginLine, t.beginColumn) ;}
    throw new Error("Missing return statement in function");
  }

  final public String datatype() throws ParseException {String s;
    s = iri();
{if ("" != null) return s;}
    throw new Error("Missing return statement in function");
  }

  final public String string() throws ParseException {Token t ; String lex ;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case STRING_LITERAL1:{
      t = jj_consume_token(STRING_LITERAL1);
lex = stripQuotes(t.image) ;
      break;
      }
    case STRING_LITERAL2:{
      t = jj_consume_token(STRING_LITERAL2);
lex = stripQuotes(t.image) ;
      break;
      }
    case STRING_LITERAL_LONG1:{
      t = jj_consume_token(STRING_LITERAL_LONG1);
lex = stripQuotes3(t.image) ;
      break;
      }
    case STRING_LITERAL_LONG2:{
      t = jj_consume_token(STRING_LITERAL_LONG2);
lex = stripQuotes3(t.image) ;
      break;
      }
    default:
      jj_la1[37] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
lex = unescapeStr(lex,  t.beginLine, t.beginColumn) ;
      {if ("" != null) return lex ;}
    throw new Error("Missing return statement in function");
  }

  final public String iri() throws ParseException {String iri = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IRIref:{
      iri = IRIREF();
{if ("" != null) return iri ;}
      break;
      }
    case PNAME_NS:
    case PNAME_LN:{
      iri = PrefixedName();
{if ("" != null) return iri ;}
      break;
      }
    default:
      jj_la1[38] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public String PrefixedName() throws ParseException {Token t ;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PNAME_LN:{
      t = jj_consume_token(PNAME_LN);
{if ("" != null) return resolvePName(t.image, t.beginLine, t.beginColumn) ;}
      break;
      }
    case PNAME_NS:{
      t = jj_consume_token(PNAME_NS);
{if ("" != null) return resolvePName(t.image, t.beginLine, t.beginColumn) ;}
      break;
      }
    default:
      jj_la1[39] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public String IRIREF() throws ParseException {Token t ;
    t = jj_consume_token(IRIref);
{if ("" != null) return resolveQuotedIRI(t.image, t.beginLine, t.beginColumn) ;}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public ShaclCompactParserJJTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[40];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static private int[] jj_la1_3;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
      jj_la1_init_3();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x0,0x0,0x0,0x0,0x0,0x2,0x0,0xfffffe00,0xfffffe00,0xfffffe00,0x0,0x0,0x0,0xfffffff8,0xfffffff8,0x0,0x0,0xfffffff8,0x0,0x1f8,0x0,0x0,0xfffffe00,0xffffe000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x200000,0x1c00000,0x6000000,0x6000000,0x1c00000,0x0,0x0,0x3,0x3,0x3,0x0,0x0,0x18000000,0x3,0x3,0x0,0x0,0x3,0x0,0x0,0x0,0x18000000,0x3,0x3fff,0x0,0x0,0x40000000,0x0,0x40000000,0x0,0x18000000,0x18000000,0x18000000,0x18000000,0x0,0x4000,0x4000,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x38000,0xf8216,0x10,0xf8216,0x1,0x10,0xbc03a000,0xfa812,0xfa812,0x1,0x10,0xf8802,0x80000080,0x0,0xc0002,0xbc03a000,0x0,0x0,0x1,0x40,0xa0,0x38204,0xa0,0x38200,0xbc038000,0xbc038000,0xbc000000,0x0,0x80000000,0x0,0x0,0x3c000000,0x38000,0x30000,};
   }
   private static void jj_la1_init_3() {
      jj_la1_3 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x3,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x3,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x3,0x3,0x3,0x0,0x3,0x8,0x8,0x0,0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public ShaclCompactParserJJ(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ShaclCompactParserJJ(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ShaclCompactParserJJTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 40; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 40; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ShaclCompactParserJJ(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ShaclCompactParserJJTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 40; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 40; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ShaclCompactParserJJ(ShaclCompactParserJJTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 40; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ShaclCompactParserJJTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 40; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[112];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 40; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
          if ((jj_la1_3[i] & (1<<j)) != 0) {
            la1tokens[96+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 112; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

 }
