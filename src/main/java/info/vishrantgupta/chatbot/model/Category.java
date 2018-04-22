/*
 * Copyright (c) 2018 Vishrant Gupta <firstname.lastname@gmail.com>
 *
 * License: MIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package info.vishrantgupta.chatbot.model;

/**
 * @author Vishrant Gupta
 *
 */
public class Category {

	private Pattern pattern;
	private Template template;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Category other = (Category) obj;
		if (this.pattern == null) {
			if (other.pattern != null) {
				return false;
			}
		} else if (!this.pattern.equals(other.pattern)) {
			return false;
		}
		if (this.template == null) {
			if (other.template != null) {
				return false;
			}
		} else if (!this.template.equals(other.template)) {
			return false;
		}
		return true;
	}

	public Pattern getPattern() {
		return this.pattern;
	}

	public Template getTemplate() {
		return this.template;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.pattern == null) ? 0 : this.pattern.hashCode());
		result = prime * result
				+ ((this.template == null) ? 0 : this.template.hashCode());
		return result;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	@Override
	public String toString() {
		return "Category [pattern=" + this.pattern + ", template="
				+ this.template + "]";
	}

}
