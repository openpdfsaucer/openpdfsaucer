# OpenPDFSaucer is an open source Java library for PDF files

OpenPDFSaucer is an open source Java library for creating, editing and rendering PDF files in Java:
- [OpenPDF](openpdf): creating and editing PDF files.
- [FlyingSaucer](flying-saucer-pdf): rendering arbitrary well-formed XML (or XHTML) using CSS 2.1 for layout and formatting, output to Swing panels, PDF, and images.
- [PDFrenderer](PDFrenderer): rendering PDF documents to the screen using Java2D as images.

OpenPDFSaucer is a combined fork of OpenPDF version 2.0.3 (forked from iText), FlyingSaucer v9.11.0 and PDFRenderer. 

![CI](https://github.com/openpdfsaucer/openpdfsaucer/actions/workflows/maven.yml/badge.svg)
[![License (LGPL version 2.1)](https://img.shields.io/badge/license-GNU%20LGPL%20version%202.1-blue.svg?style=flat-square)](http://opensource.org/licenses/LGPL-2.1)
[![CodeQL](https://github.com/openpdfsaucer/openpdfsaucer/actions/workflows/github-code-scanning/codeql/badge.svg)](https://github.com/openpdfsaucer/openpdfsaucer/actions/workflows/github-code-scanning/codeql)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/fa63ee335ecb4225808d1b4f3e4d6392)](https://app.codacy.com/gh/openpdfsaucer/openpdfsaucer/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)


## Features

Some of the features of OpenPDFSaucer include:

* Creating PDFs: You can use OpenPDF to create new PDF documents from scratch.
* Manipulating Existing PDFs: OpenPDF allows you to modify existing PDF documents by adding or removing pages, modifying
  text, and more.
* Text and Font Support: You can add text to PDF documents using various fonts and styles, and extract text from PDF
  files.
* Complex scripts: OpenPDF supports glyph layout for complex scripts and DIN 91379.
* Graphics and Images: OpenPDF supports the addition of images and graphics to PDF files.
* Table Support: The library facilitates the creation of tables in PDF documents.
* Encryption: You can encrypt PDF documents for security purposes.
* Page Layout: OpenPDF allows you to set the page size, orientation, and other layout properties.
* Rendering arbitrary well-formed XML (or XHTML) using CSS 2.1 for layout and formatting, output to Swing panels, PDF, and images, using Flying Saucer.
* Render PDF files as images using PDFrenderer.

# OpenPDFSaucer 2.0.7
Get OpenPDFSaucer here: https://github.com/openpdfsaucer/openpdfsaucer/releases/tag/2.0.7  


## Use OpenPDFSaucer as Maven dependency

Add this to your pom.xml file to use the latest version of OpenPDFSaucer:

```xml
<dependency>
    <groupId>io.github.openpdfsaucer</groupId>
    <artifactId>openpdfsaucer-parent</artifactId>
    <version>2.0.7</version>
</dependency>
```


## OpenPDFSaucer has these modules:
* [Openpdf](openpdf) OpenPDF is a free Java library for creating and editing PDF files.
* [Flying-saucer-core](flying-saucer-core) Flying Saucer is a Java library for rendering arbitrary well-formed XML (or XHTML) using CSS 2.1 for layout and formatting, output to Swing panels, PDF, and images.
* [Flying-saucer-pdf](flying-saucer-pdf) Flying Saucer PDF rendering of HTML.
* [Flying-saucer-browser](flying-saucer-browser) - a web browser in Java. 
* [PDFrenderer](PDFrenderer) Java library for rendering PDF documents to the screen using Java2D.
* [Openpdf-fonts-extra](openpdf-fonts-extra) Fonts for OpenPDF
* [Pdf-toolbox](pdf-toolbox) PDF toolbox

# Documentation
* [JavaDoc](https://openpdfsaucer.github.io/openpdfsaucer/)

## License
OpenPDFSaucer is licended with GNU Lesser General Public License (LGPL), Version 2.1. This is the same license as the source code it is forked from: OpenPDF, Flying Saucer and PDFrenderer.

[GNU Lesser General Public License (LGPL), Version 2.1](https://www.gnu.org/licenses/old-licenses/lgpl-2.1)

> For a short explanation see https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License

We want OpenPDFSaucer to consist of source code which is consistently licensed with the LGPL 
licences only. This also means that any new contributions to the project must have a LGPL license only.
OpenPDF had a dual LGPL / MPL license, this fork will use the LGPL license specifically.

## Contributing

  Please send all pull requests. Make sure that your contributions can be
released with a LGPL license. In particular, pull requests to the OpenPDF project must
only contain code that you have written yourself. GPL or AGPL licensed code will not be acceptable.

To contribute code to the OpenPDFSaucer project, your GitHub account must contain your real name, so that
we can verify your identity. This is to ensure the trust, security and integrity of the OpenPDFSaucer
project, and to prevent security incidents such as the "XZ Utils backdoor". Knowning the real name
of the contributors will also identify and prevent conflict of interests.

More details: [Contributing](CONTRIBUTING.md)

### Coding Style

- Code indentation style is 4 spaces. Maximum line length is 120 characters.
- Generally try to preserve the coding style in the file you are modifying.

## Dependencies

### Required Dependencies

- OpenPDFSaucer requires Java 21. This project is focusing on modernization and using modern technologies and APIs.

### Supporting complex glyph substitution/ Ligature substitution

OpenPDF supports glyph substitution which is required for correct rendering of fonts ligature substitution requirements.
FOP dependency is required to enable this feature. Refer following wiki for
details: [wiki](https://github.com/LibrePDF/OpenPDF/wiki/Multi-byte-character-language-support-with-TTF-fonts)

### Supporting OpenType layout, glyph positioning, reordering and substitution

OpenPDF supports complex scripts, OpenType layout, glyph positioning, reordering and substitution which is e.g. required for correct
positioning of accents, the rendering of non-Latin and right-to-left scripts. OpenPDF supports DIN 91379.
See: [wiki](https://github.com/openpdfsaucer/openpdfsaucer/wiki/OpenPDF:-Accents,-DIN-91379,-non-Latin-scripts)

### Optional

- [BouncyCastle](https://www.bouncycastle.org/) (BouncyCastle is used to sign PDF files, so it's a recommended
  dependency)
  - Provider (`org.bouncycastle:bcprov-jdk18on` or `org.bouncycastle:bcprov-ext-jdk18on` depending
    on which algorithm you are using)
  - PKIX/CMS (`org.bouncycastle:bcpkix-jdk18on`)
- Apache FOP (`org.apache.xmlgraphics:fop`)
- Please refer to our [pom.xml](pom.xml) to see what version is needed.

## Credits
- OpenPDF, FlyingSaucer and PDF renderer contributors.
- Please see [Contributors.md](Contributors.md).
