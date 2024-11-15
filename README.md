# OpenPDFSaucer is an open source Java library for PDF files

- OpenPDFSaucer (OpenPDF) is a Java library for creating and editing PDF files..
- OpenPDFSaucer (FlyingSaucer) is a Java library for rendering arbitrary well-formed XML (or XHTML) using CSS 2.1 for layout and formatting, output to Swing panels, PDF, and images.
- OpenPDFSaucer (PDFrenderer) is a Java library for rendering PDF documents to the screen using Java2D.

OpenPDFSaucer is a fork of OpenPDF version 2.0.3 (forked from iText), FlyingSaucer v9.11.0 and PDFRenderer. 

![CI](https://github.com/openpdfsaucer/openpdfsaucer/actions/workflows/maven.yml/badge.svg)
[![License (LGPL version 2.1)](https://img.shields.io/badge/license-GNU%20LGPL%20version%202.1-blue.svg?style=flat-square)](http://opensource.org/licenses/LGPL-2.1)
[![License (MPL)](https://img.shields.io/badge/license-Mozilla%20Public%20License-yellow.svg?style=flat-square)](http://opensource.org/licenses/MPL-2.0)


## Features

Some of the features of OpenPDFSaucer include:

* Creating PDFs: You can use OpenPDF to create new PDF documents from scratch.
* Manipulating Existing PDFs: OpenPDF allows you to modify existing PDF documents by adding or removing pages, modifying
  text, and more.
* Text and Font Support: You can add text to PDF documents using various fonts and styles, and extract text from PDF
  files.
* Graphics and Images: OpenPDF supports the addition of images and graphics to PDF files.
* Table Support: The library facilitates the creation of tables in PDF documents.
* Encryption: You can encrypt PDF documents for security purposes.
* Page Layout: OpenPDF allows you to set the page size, orientation, and other layout properties.
* Rendering arbitrary well-formed XML (or XHTML) using CSS 2.1 for layout and formatting, output to Swing panels, PDF, and images.
* Render PDF files as images.

## OpenPDFSaucer has these modules:
* [Openpdf](openpdf) OpenPDF is a free Java library for creating and editing PDF files.
* [Openpdf-fonts-extra](openpdf-fonts-extra)
* [Flying-saucer-core](flying-saucer-core) Flying Saucer is a pure-Java library for rendering arbitrary well-formed XML (or XHTML) using CSS 2.1 for layout and formatting, output to Swing panels, PDF, and images.
* [Flying-saucer-pdf](flying-saucer-pdf)
* [Flying-saucer-browser](flying-saucer-browser)
* [PDFrenderer](PDFrenderer) Java library for rendering PDF documents to the screen using Java2D.

## License
OpenPDFSaucer is licended with GNU Lesser General Public License (LGPL), Version 2.1. This is the same license as the source code it is forked from: OpenPDF and Flying Saucer.


[GNU Lesser General Public License (LGPL), Version 2.1](https://www.gnu.org/licenses/old-licenses/lgpl-2.1)

> For a short explanation see https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License

[Mozilla Public License Version 2.0](http://www.mozilla.org/MPL/2.0/)

> For a short explanation see https://en.wikipedia.org/wiki/Mozilla_Public_License

You can find also a nice explanation of these licenses under https://itsfoss.com/open-source-licenses-explained/

We want OpenPDFSaucer to consist of source code which is consistently licensed with the LGPL and MPL
licences only. This also means that any new contributions to the project must have a dual LGPL and
MPL license only.

## Documentation

- [Examples](pdf-toolbox/src/test/java/com/lowagie/examples)
- [JavaDoc](https://javadoc.io/doc/com.github.librepdf/openpdf/latest/index.html)
- [Tutorial](https://github.com/LibrePDF/OpenPDF/wiki/Tutorial) (wiki, work in progress)
- [Migration from iText, TIFF support](https://github.com/LibrePDF/OpenPDF/wiki/Migrating-from-iText-2-and-4)


## Contributing

Release the hounds!  Please send all pull requests. Make sure that your contributions can be
released with a dual LGPL and MPL license. In particular, pull requests to the OpenPDF project must
only contain code that you have written yourself. GPL or AGPL licensed code will not be acceptable.

To contribute code to the OpenPDF project, your GitHub account must contain your real name, so that
we can verify your identity. This is to ensure the trust, security and integrity of the OpenPDF
project, and to prevent security incidents such as the "XZ Utils backdoor". Knowning the real name
of the contributors will also identify and prevent conflict of interests.

More details: [Contributing](CONTRIBUTING.md)

### Coding Style

- Code indentation style is 4 spaces. Maximum line length is 120 characters.
- Generally try to preserve the coding style in the file you are modifying.

## Dependencies

### Required Dependencies

We have now different versions of OpenPDF, and they require different versions of Java:

- The 2.0.x Branch requires Java 17 or later.
- OpenPDF versions 2.0.x: We are working on modernizing the OpenPDF library for Java
  17+.

### Supporting complex glyph substitution/ Ligature substitution

OpenPDF supports glyph substitution which is required for correct rendering of fonts ligature substitution requirements.
FOP dependency is required to enable this feature. Refer following wiki for
details: [wiki](https://github.com/LibrePDF/OpenPDF/wiki/Multi-byte-character-language-support-with-TTF-fonts)

### Supporting OpenType layout, glyph positioning, reordering and substitution

OpenPDF supports OpenType layout, glyph positioning, reordering and substitution which is e.g. required for correct
positioning of accents, the rendering of non-Latin and right-to-left scripts. OpenPDF supports DIN 91379.
See: [wiki](https://github.com/LibrePDF/OpenPDF/wiki/Accents,-DIN-91379,-non-Latin-scripts)

### Optional

- [BouncyCastle](https://www.bouncycastle.org/) (BouncyCastle is used to sign PDF files, so it's a recommended
  dependency)
  - Provider (`org.bouncycastle:bcprov-jdk18on` or `org.bouncycastle:bcprov-ext-jdk18on` depending
    on which algorithm you are using)
  - PKIX/CMS (`org.bouncycastle:bcpkix-jdk18on`)
- Apache FOP (`org.apache.xmlgraphics:fop`)
- Please refer to our [pom.xml](pom.xml) to see what version is needed.

## Credits

Please see [Contributors.md](Contributors.md).
